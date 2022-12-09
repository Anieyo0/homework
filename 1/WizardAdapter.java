public class WizardAdapter extends Fighter {
    
    public WizardAdapter(){
        System.out.println('직업 : 마법사');
    }

    public void attack(){
        Wizard wizard = new Wizard();
        wizard.shot_fire_ball();
    }

    public void defend(){
        Wizard wizard = new Wizard();
        wizard.shield();
    }

    public void escape(){
        Wizard wizard = new Wizard();
        wizard.portal();
    }
}