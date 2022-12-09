public class WizardAdapter extends Fighter {

	Wizard wizard = new Wizard();
    public WizardAdapter(){
        System.out.println("직업 : 마법사");
    }

    public void attack(){
        wizard.shot_fire_ball();
    }

    public void defend(){
        wizard.shield();
    }

    public void escape(){
        wizard.portal();
    }
}
