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

    static void kata03(){
        System.out.println(" kata 03");
        int error=0;

        if(StringCalc.add("1\n2,3") != 6){
            error+=1;
            System.err.println("Ошибка строки: 1\n2,3");
        }

        if(StringCalc.add("4\n5\n6") != 15){
            error+=1;
            System.err.println("Ошибка строки: 4\n5\n6");
        }

        if(StringCalc.add("77\n") != 77){
            error+=1;
            System.err.println("Ошибка строки: 77\n");
        }
        else{
            System.out.println("Successful");
        }
    }

    static void kata04(){
        System.out.println(" kata 04");
        int error=0;

        if(StringCalc.add("1,1001") != 1){
            error+=1;
            System.err.println("Ошибка строки: 1,1001");
        }

        if(StringCalc.add("1002\n2") != 2){
            error+=1;
            System.err.println("Ошибка строки: 1002\n2");
        }

        if(StringCalc.add("1,1000") != 1001){
            error+=1;
            System.err.println("Ошибка строки: 1,1000");
        }
        if(StringCalc.add("1000,1000") != 2000){
            error+=1;
            System.err.println("Ошибка строки: 1000,1000");
        }
        if(StringCalc.add("1001\n1001") != 0){
            error+=1;
            System.err.println("Ошибка строки: 1001\n1001");
        }
        else{
            System.out.println("Successful");
        }
    }

    static void kata05(){
        System.out.println(" kata 05");
        int error=0;

        if(StringCalc.add("//;\n1;2") != 3){
            error+=1;
            System.err.println("Ошибка строки: //;\n1;2");
        }

        if(StringCalc.add("//\n2,3") != 5){
            error+=1;
            System.err.println("Ошибка строки: //*\n2,3");
        }

        if(StringCalc.add("//#\n3#4") != 7){
            error+=1;
            System.err.println("Ошибка строки: //#\n3#4");
        }
        else{
            System.out.println("Successful");
        }
    }

    public static void main(String[] args) {
        kata01();
        System.out.println("\n");
        kata02();
        System.out.println("\n");
        kata03();
        System.out.println("\n");
        kata04();
        System.out.println("\n");
        kata05();
    }
}
