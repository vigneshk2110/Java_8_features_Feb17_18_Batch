package methodReferencing;

import java.util.*;

public class MethodReferencingExe3 {
//	Instance methods of particular objects
	
	public static void main(String[] args) {
		BicycleComparator bikeFrameSizeComparator = new BicycleComparator();
		List<Bicycle> biCycleList = new ArrayList<>();
		Bicycle b1 = new Bicycle("Atlas", 25);
		Bicycle b2 = new Bicycle("Hero", 20);
		Bicycle b3 = new Bicycle("Ridley", 21);
		Bicycle b4 = new Bicycle("Jumbo", 29);
		biCycleList.add(b1); biCycleList.add(b2);biCycleList.add(b3); biCycleList.add(b4);
		
//		biCycleList.stream().sorted((a,b) -> bikeFrameSizeComparator.compare(a, b));
		
//		biCycleList.stream().sorted(bikeFrameSizeComparator::compare).forEach(System.out::println);;
		biCycleList.forEach(System.out::println);
		
		Collections.sort(biCycleList, bikeFrameSizeComparator::compareBYFrameSize);
		
		System.out.println("----------------------------------------------");
		
		biCycleList.forEach(System.out::println);
		
		System.out.println("----------------------------------------------");
		
		Collections.sort(biCycleList, bikeFrameSizeComparator::compareByBrand);
		biCycleList.forEach(System.out::println);
		
	}

}
class Bicycle {

    private String brand;
    private Integer frameSize;
    
    public Bicycle(String string, int i) {
		this.brand = string;
		this.frameSize = i;
	}
    
   

	@Override
	public String toString() {
		return "Bicycle [brand=" + brand + ", frameSize=" + frameSize + "]";
	}

	// standard constructor, getters and setters
	public Integer getFrameSize() {
    	return this.frameSize;
    }
	
	public String getBrand() {
		return brand;
	}

}

class BicycleComparator{

    public int compareBYFrameSize(Bicycle a, Bicycle b) {
        return a.getFrameSize().compareTo(b.getFrameSize());
    }
    
    public int compareByBrand(Bicycle a, Bicycle b) {
        return a.getBrand().compareTo(b.getBrand());
    }

}