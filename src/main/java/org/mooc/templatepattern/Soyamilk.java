package org.mooc.templatepattern;

public abstract class Soyamilk {

    public final void make(){ //制作豆浆  final 不允许更改
        select();
        addIngredients();
        soak();
        beat();
    }
    void select(){
        System.out.println("开始选择黄豆");
    }
    public abstract void addIngredients(); // 豆浆添加配料
    public void soak(){// 豆浆侵泡
        System.out.println("开始侵泡黄豆");
    }
    public void beat(){// 豆浆打磨
        System.out.println("豆浆打磨");
    }
}
