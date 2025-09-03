class port {
    protected String p_id;
    protected ArrayList<vehicle>vehicles = new ArrayList<>(); //contain vehicles
    protected ArrayList<container>containers = new ArrayList<>(); //contain containers
    protected ArrayList<trip>trips = new ArrayList<>(); //contain trips
    protected String p_name;
    protected float latitude;
    protected float longitude;
    protected float storing_cap;
    protected boolean landing_abi; //
    protected int total_con = vehicles.size();
    protected int total_vi = containers.size();

}