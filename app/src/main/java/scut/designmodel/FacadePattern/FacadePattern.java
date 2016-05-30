package scut.designmodel.FacadePattern;

//部门A的工作
class MoldingDepartmentA {
    public void ProductADelivery(){
        System.out.println("注塑产品A部门配送产品！");
    }

    public void ProductAReport(){
        System.out.println("注塑产品A部门汇报工作！");
    }

}

//部门B的工作
class MoldingDepartmentB {
    public void ProductBDelivery(){
        System.out.println("注塑产品B部门配送产品！");
    }

    public void ProductBReport(){
        System.out.println("注塑产品B部门汇报工作！");
    }

}

//工厂办事处，也就是两个加工厂的“外观”
class FactoryOffice{
    MoldingDepartmentA mmoldingDepartmentA;
    MoldingDepartmentB mmoldingDepartmentB;

    //构造函数建造工厂实例
    public FactoryOffice(){
        mmoldingDepartmentA = new MoldingDepartmentA();
        mmoldingDepartmentB = new MoldingDepartmentB();
    }

    //管理工厂配送
    public void FactoryDelivery(){
        mmoldingDepartmentA.ProductADelivery();
        mmoldingDepartmentB.ProductBDelivery();
    }

    //管理工厂汇报
    public void FactoryReport(){
        mmoldingDepartmentA.ProductAReport();
        mmoldingDepartmentB.ProductBReport();
    }
}

public class FacadePattern {
    //小成老板用办事处管理两间工厂的工作
    public static void main(String[] arg){
        FactoryOffice mfactoryOffice = new FactoryOffice();
        mfactoryOffice.FactoryDelivery();
        mfactoryOffice.FactoryReport();
    }
}


