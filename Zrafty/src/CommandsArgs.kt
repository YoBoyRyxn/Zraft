import java.util.Scanner

public class CommandsArgs {
    private final val s = Scanner(System.`in`);
    fun generateNames() {
        println("Enter Name One: ");
        val name1 = s.nextLine();

        println("Enter Name Two: ");
        val name2 = s.nextLine();

        val arr1 = ArrayList<String>();
        arr1.add(name1);
        arr1.add(name2);

        println("Name 1:  " + arr1.first());
        println("Name 2:  " + arr1.last());
    }
}