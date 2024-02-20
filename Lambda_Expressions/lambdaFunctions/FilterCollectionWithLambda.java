package lambdaFunctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;  
import java.util.stream.Stream;   

public class FilterCollectionWithLambda {
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<Product> filtered_data = list.stream().
        		filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> 
                System.out.println(product.name+": "
                +product.price)  
        );  
        
        System.out.println("-----------------------");
        
        Collections.sort(list, (p1, p2) ->{
        	if (p1.price < p2.price){
        		 return -1;
        	}	 
        	return 1;       	
			});
        
        System.out.println("-----------------------");
        for (Product product2 : list) {
			System.out.println(product2.name);
		}
    }  
}  
