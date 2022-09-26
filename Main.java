import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("曹操",1001,"219","魏",95);
        Hero hero2 = new Hero("曹丕",1002,"249","魏",92);
        Hero hero3 = new Hero("张辽",1003,"234","魏",95);
        Hero hero4 = new Hero("刘备",2001,"220","蜀",95);
        Hero hero5 = new Hero("关羽",2002,"221","蜀",92);
        Hero hero6 = new Hero("张飞" ,2003,"222","蜀",97);
        Hero hero7 = new Hero("赵云",2004,"223","蜀",97);
        Hero hero8 = new Hero("马超",2005,"224","蜀",95);
        Hero hero9 = new Hero("鲁迅",3001,"226","吴",91);
        ArrayList<Hero> arrayList = new ArrayList<>();
        arrayList.add(hero1);
        arrayList.add(hero2);
        arrayList.add(hero3);
        arrayList.add(hero4);
        arrayList.add(hero5);
        arrayList.add(hero6);
        arrayList.add(hero7);
        arrayList.add(hero8);
        arrayList.add(hero9);
        Hero.countNumOfNation(arrayList,"魏");
        Hero.selectPerson(arrayList,"马超");
        Hero.changeBirthdayByName(arrayList,"马超","20220921");
        Hero.selectPerson(arrayList,"马超");
        System.out.println(Hero.deletePersonByName(arrayList, "马超"));
    }
}
