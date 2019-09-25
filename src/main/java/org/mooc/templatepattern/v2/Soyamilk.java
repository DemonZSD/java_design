package org.mooc.templatepattern.v2;

public abstract class Soyamilk {

    public final void make(){ //制作豆浆  final 不允许更改
        select();
        if(customWantIngredient()){
            addIngredients();
        }
        soak();
        beat();
    }
    void select(){
        System.out.println("开始选择黄豆");
    }
    public abstract void addIngredients(); // 豆浆添加配料
    void soak(){// 豆浆侵泡
        System.out.println("开始侵泡黄豆");
    }
    void beat(){// 豆浆打磨
        System.out.println("豆浆打磨");
    }

    // 钩子方法，决定要不要加配料，还是制作原味豆浆
    boolean customWantIngredient(){
        return true;
    }
}
