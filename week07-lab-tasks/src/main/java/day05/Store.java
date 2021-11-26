package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {
	private List<Product> productList = new ArrayList<>();

	public List<Product> getProductList() {
		return productList;
	}

	public void addProduct(Product p) {
		if(p.getSellDate().isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Invalid date");
		} else productList.add(p);
	}

//	public List<Product> exportToCSVFile(int monthNumber) {
//		List<Product> listOfExportedProducts = new ArrayList<>();
//		for(Product thisProduct : productList) {
//			if (thisProduct.getSellDate().getMonthValue() == monthNumber) {
//				listOfExportedProducts.add(thisProduct);
//			}
//		}
//		if (listOfExportedProducts.size() > 0) writeListToFile(monthNumber, listOfExportedProducts);
//		return listOfExportedProducts;
//	}
//
//	private void writeListToFile(int monthNumber, List<Product> listOfExportedProducts) {
//
//		try {
////			Files.write(Paths.get("names.txt"), listOfExportedProducts);
//		}
//		catch (IOException ioe) {
//			ioe.printStackTrace();
//		}
//	}

	public Path writeToFileByMonth (Month month, Path testPath) {
		List <String> result = createStringByMonth(month);

		try {
			StringBuilder sb = new StringBuilder().append("soldProducts_").append(month.name()).append((".csv"));
			Path path = Path.of(sb.toString());
			Files.write(testPath, result);
			return path;
		} catch (IOException e) {
			throw new IllegalArgumentException("Cannot write file!", e);
		}
	}

	private List<String> createStringByMonth(Month month) {
		List <String> result = new ArrayList<>();
		for (Product actual : productList) {
			if (actual.getSellDate().getMonth() == month) {
				result.add(actual.toString());
			}
		}

		return result;
	}
}
