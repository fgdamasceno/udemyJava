package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProductExercicioFixacao extends ProductExercicioFixacao {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProductExercicioFixacao() {
		super();
	}

	public UsedProductExercicioFixacao(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return super.getName() + " (used) $ " + String.format("%.2f", super.getPrice()) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}

}
