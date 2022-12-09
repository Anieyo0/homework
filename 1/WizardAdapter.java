public class WizardAdapter extends Fighter {

	Wizard wizard = new Wizard();
    public WizardAdapter(){
        
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
