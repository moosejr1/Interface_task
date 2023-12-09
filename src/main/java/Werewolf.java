/* ToDo:Implement the methods speak() and sound().
* The speak() method should check the boolean value isHumanForm and if the answer is true, return "I am a human."
* If the value is false, return "I cannot speak in wolf form."
* The sound() method should check the boolean value isHumanForm and if the answer is true, return "No sound in human form."
* If the value is false, return "Howl!"
* It's important that the returned values are exactly as specified so that the tests pass successfully. */

public class Werewolf extends Mutant implements Animal, Human{
    public boolean isHumanForm;

    public Werewolf() {
        this.isHumanForm = true;
    }
    @override
    public String speak(){
        if(boolean == true){
            System.out.println("I am a human");
        }else{
            System.out.println("I cannot speak in wolf form");
    }
    public String sound(){
        if(boolean == true){
            System.out.println("No sound in human form.");
        }else{
            System.out.println("Howl!");
        }

    default String method();
        
        
        

    public void transform() {
        isHumanForm = !isHumanForm;
        if (isHumanForm) {
            System.out.println("Transformed into a human.");
        } else {
            System.out.println("Transformed into a wolf.");
        }
    }

    @Override
    public String sound() {
        return null;
    }

    @Override
    public String speak() {
        return null;
    }
}
