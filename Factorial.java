/**
Chavez Hernandez Luis Eduardo 23160864
 */
public class Factorial
{
    private int var;
    public Factorial()
    {   
        var = 0;
    }

    public int recursivo(int n){
        //caso base
        if(n==1)
            return n;
        // caso recursivo
        return n*recursivo(n-1);
    }
}
