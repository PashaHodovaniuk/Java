public abstract class MenuRealize {
    protected MenuRealize menu;
    /* run our menu*/
   
    public MenuRealize() {
        menu = this;
    }
        
    public MenuRealize runMenus() {
    	Select();
    	runMenu();
        return menu;
    }
    
    /* print text message*/
    public abstract void Select();
    
    /* handle click*/
    public abstract void runMenu();

}