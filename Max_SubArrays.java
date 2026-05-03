package Dsa_Once_Again.Array_Pattern3_Sliding_Window;

public class Max_SubArrays {
    static void findtheslidingwindow(int[] users, int days)

    {
        //1st loop from 0 to days tk
        int windowsize=0;
        int max=0;
        for(int i=0; i<days;i++)
        {
            windowsize=windowsize+users[i];
        }
        System.out.println("Total no of users visiting " +windowsize);
        //To manage the sliding winow
        for(int i=1; i<=users.length-days; i++)
        {
            windowsize= windowsize-users[i-1]+users[i+days-1];

if(windowsize>users[i])
    max=windowsize;
        }
        System.out.print(windowsize);
        System.out.print(max);
    }

    public static void main(String[] args) {
        int[]user={100,48,82,57,34,112,65};
        findtheslidingwindow(user,3);
    }
}
