package scut.designmodel.BuilderPattern;

//产品生产线抽象类
abstract class ProductBuilder{
    public abstract void GetMaterial();
    public abstract void Making();
    public abstract void Show();
}

//A产品生产线
class ProductABuilder extends ProductBuilder{
    @Override
    public void GetMaterial() {
        System.out.println("获取A产品原料");
    }

    @Override
    public void Making() {
        System.out.println("制造A产品");
    }

    @Override
    public void Show() {
        System.out.println("生产出了A产品");
    }
}

//B产品生产线
class ProductBBuilder extends ProductBuilder{
    @Override
    public void GetMaterial() {
        System.out.println("获取B产品原料");
    }

    @Override
    public void Making() {
        System.out.println("制造B产品");
    }

    @Override
    public void Show() {
        System.out.println("生产出了B产品");
    }
}

//控制者类
class Controler{
    public void Construct(ProductBuilder builder){
        builder.GetMaterial();
        builder.Making();
        builder.Show();
    }
}
//使用生产流水线
public class BuilderPattern {
    public static void main(String[] args){
        ProductABuilder mProductABuilder = new ProductABuilder();
        ProductBBuilder mProductBBuilder = new ProductBBuilder();
        Controler mControler = new Controler();
        //生产产品A
        mControler.Construct(mProductABuilder);
        //生产产品B
        mControler.Construct(mProductBBuilder);
    }
}
