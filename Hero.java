import java.util.ArrayList;

public class Hero {
    String name;
    int idNum;
    String birthday;
    String nation;
    int grade;
    boolean status = true;

    public Hero(String name, int idNum, String birthday, String nation, int grade) {
        this.name = name;
        this.idNum = idNum;
        this.birthday = birthday;
        this.nation = nation;
        this.grade = grade;
    }
    public static int countNumOfNation(ArrayList<Hero> arrayList,String nation){
        int count = 0;
        for(Hero hero : arrayList){
            if (hero.nation==nation){
                count++;
            }
        }
        System.out.println(nation+"国"+"人物的数量为"+count);
        return count;
    }
    public static boolean selectPerson(ArrayList<Hero> arrayList,String name){
        for(Hero hero : arrayList){
            if (hero.name.equals(name)){
                System.out.println("姓名:"+hero.name+","+"国别:"+hero.nation+","+"生日:"+hero.birthday);
                return true;
            }
        }
        return false;
    }
    public static boolean changeBirthdayByName(ArrayList<Hero> arrayList,String name,String birthday){
        for(Hero hero : arrayList){
            if (hero.name.equals(name)){
                hero.birthday=birthday;
                return true;
            }
        }
        return false;
    }
    public static boolean deletePersonByName(ArrayList<Hero> arrayList,String name){
        for(Hero hero : arrayList){
            if (hero.name.equals(name)){
                hero.status=false;
                return true;
            }
        }
        return false;
    }
}
