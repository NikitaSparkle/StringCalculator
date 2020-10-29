package homework;

public class StringCalcTest {
    static void kata01(){
        System.out.println(" kata 01");
        int error=0;

        if(StringCalc.add(null) != 0){
            error+=1;
            System.err.println("Ошибка null");
        }

        if(StringCalc.add("") != 0){
            error+=1;
            System.err.println("Ошибка пустой строки");
        }

        if(StringCalc.add("1") != 1){
            error+=1;
            System.err.println("Ошибка строки: 1");
        }

        if(StringCalc.add("1,2") != 3){
            error+=1;
            System.err.println("Ошибка строки: 1,2");
        }

        if(StringCalc.add("4,") != 4){
            error+=1;
            System.err.println("Ошибка строки: 4,");
        }

        if(error>0) {
            System.err.println("Ошибок: "+error);
        }
        else{
            System.out.println("Successful");
        }

    }

    static void kata02(){
        System.out.println(" kata 02");
        int error=0;

        if(StringCalc.add("1,2,3") != 6){
            error+=1;
            System.err.println("Ошибка строки: 1,2,3");
        }

        if(StringCalc.add("1,1,1,1") != 4){
            error+=1;
            System.err.println("Ошибка строки: 1,1,1,1");
        }

        if(StringCalc.add("1,2") != 3){
            error+=1;
            System.err.println("Ошибка строки: 1,2");
        }

        if(StringCalc.add("11,22,33") != 66){
            error+=1;
            System.err.println("Ошибка строки: 11,22,33");
        }

        if(error>0) {
            System.err.println("Ошибок: "+error);
        }
        else{
            System.out.println("Successful");
        }
    }


    public static void main(String[] args) {
        kata01();
        System.out.println("\n");
        kata02();
    }
}
