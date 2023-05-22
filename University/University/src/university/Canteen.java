package university;



import java.util.ArrayList;
import java.util.List;

public class Canteen {
	private List<String> dishes;
    private String dailyMenu;

    public Canteen() {
        this.dishes = new ArrayList<>();
        this.dailyMenu = "";
    }

    
    

    public List<String> getDishes() {
		return dishes;
	}




	public void setDishes(List<String> dishes) {
		this.dishes = dishes;
	}




	public String getDailyMenu() {
		return dailyMenu;
	}




	public void addDish(String dish) {
        dishes.add(dish);
    }

    public void removeDish(String dish) {
        dishes.remove(dish);
    }

    public void setDailyMenu(String menu) {
        this.dailyMenu = menu;
    }


    public void canteenInfo(Canteen canteen) {
    	System.out.println("	Canteen Menu:");
		System.out.println("	Daily Menu: " + canteen.getDailyMenu());
		System.out.println("	Dishes available:");
		for (String dish : canteen.getDishes()) {
			System.out.println("	- " + dish);
		}
    }

	@Override
	public String toString() {
		return "Canteen [dishes=" + dishes + ", dailyMenu=" + dailyMenu + "]";
	}

    
    
    
}
