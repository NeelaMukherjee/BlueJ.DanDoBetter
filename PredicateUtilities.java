 

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        //if (x>y){
            return x>y;
        //system.out.println(y +"is less than"+ x);
    
    //else {
        //return (y>x);
        //system.out.println(x +"is less than"+ y);
    
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        //if (x>y){
            return x<y;
        //system.out.println(y +"is less than"+ x);
    
    //else {
        //return (y>x);
        //system.out.println(x +"is less than"+ y);
    
}

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x,int y) {
        
        //if (x>y){
            return x>=y;
            
       // system.out.println(x +"is Greater than or Equal to"+ y);
    
    //else if (x=y){
        //return(x=y);
        //system.out.println(y + "+"is Greater than or Equal to"+ x);
    
    
    //else if (y<x) {
        //return (y<x);
    }
    


    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        
        //if (x<y){
            return x<=y;
            
       
    
    //else if (x=y){
        //return(x=y);
      
    
    
    //else if (y<x) {
        //return (y<x);
    
}
    
    
       /**
      * @return true
     */
    public Boolean returnTrue() {
        return true;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return false;
    }
}