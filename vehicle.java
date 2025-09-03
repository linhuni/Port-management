enum v_type {
    SHIP, TRUCK  //Define types of vehicle
} 
class vehicle {
    protected String v_id;
    protected ArrayList<container> containers = new ArrayList<>(); //contains container
    protected float amount_fuel; //7-digits number
    protected String v_name; 
    protected float current_fuel;
    protected float fuel_cap;
    protected float carrying_cap; 
    protected Port port_id;
    protected int total_con;
    protected v_type type;

}
