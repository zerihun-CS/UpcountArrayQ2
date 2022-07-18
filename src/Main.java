
public class Main {
    public static void main(String[] args) {

//option 1
        int numberz[] = {6,3,1,-8,20,-26,3,8};

        int upCount = 5;
        int partialSum = 0;
        int perviousSum = 0;
        boolean flag =true;
        int count = 0;
        int numbers[] = {2,3,1,-6,8,-3,-1,3};
        for (int i = 0; i < numberz.length ; i++) {
            partialSum = partialSum + numberz[i];
            System.out.println(partialSum);
            if (partialSum > upCount && perviousSum <=upCount) {

                count++;


            }
            perviousSum = partialSum;
        }
        System.out.println(count);

//option 2

        for (int i = 0; i < numberz.length ; i++) {
            partialSum = partialSum + numberz[i];
            if (partialSum > upCount && flag == true){
                count++;
                flag =false;
            } else if (partialSum < upCount) {
                flag =true;

            }
        }

    }


}
