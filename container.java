enum c_type {
    DRY_STORAGE, OPEN_TOP, OPEN_SIDE, REFRIGERATED, LIQUID //Define types of containers
} 
class container{
    protected String c_id;
    protected c_type type;
    protected int weight;

}