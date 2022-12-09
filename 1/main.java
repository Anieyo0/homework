public class main {
    public static void main(String[] args) {
    
    // Fighter 객체를 하나 만들고, 
    Fighter fighter1 = new Warrior();
    fighter1.attack();
    fighter1.defend();
    fighter1.escape();

    // WizardAdapter 사용
    Fighter fighter2 = new WizardAdapter();
    fighter2.attack();
    fighter2.defend(); 
    fighter2.escape();
    } 
}
