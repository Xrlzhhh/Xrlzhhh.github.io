package CoreCodePattern;

public class t01 {
    public static void main(String[] args) {
        String str = "12s3";
        t01 tool = new t01();
        System.out.println(tool.StrToInt(str));
    }
    public int StrToInt(String str) {
        if (str.length()==0){
            return 0;
        }
        if (str.charAt(0)=='+' || str.charAt(0)=='-'){
            int level = str.length()-2;
            boolean flag = false;
            if (str.charAt(0)=='+'){
                flag=true;
            }
            int sum = 0;
            int i = 1;
            while (level>=0){
                if (!(str.charAt(i)>='0' && str.charAt(i)<='9')){
                    return 0;
                }
                sum+=Math.pow(10,level)*(str.charAt(i)-'0');
                i++;
                level--;
            }
            if (flag){
                return (int) sum;
            }else {
                return (int) -sum;
            }
        }else {
            int sum = 0;
            int j = 0;
            for(int i= str.length()-1;i>=0;i--){
                if (!(str.charAt(i)>='0' && str.charAt(i)<='9')){
                    return 0;
                }
                sum+=Math.pow(10,i)*(str.charAt(j)-'0');
                j++;
            }
            return (int)sum;
        }
    }
}
