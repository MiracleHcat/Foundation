public class Main {
    public static void main(String[] args){
        System.out.println("请输入现金数:");
        System.out.println("请输入啤酒单价:");
        Scanner sc=new Scanner(System.in);
        int cash=sc.nextInt();
        int price=sc.nextInt();
        int n=cash/price;
        int battle=cash/price;
        int cover=cash/price;
        while(true){
            if(battle>=2){
                n=n+battle/2;
                cover+=battle/2;
                battle=battle%2+battle/2;
            }
            else if(cover>=4){
                n+=cover/4;
                battle+=cover/4;
                cover=cover%4+cover/4;
            }
            else{
                break;
            }
        }
        System.out.print("能喝的啤酒数为:"+n);
    }
}