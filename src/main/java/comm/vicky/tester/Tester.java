package comm.vicky.tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vicky.dao.CategoryDao;
import com.vicky.dao.ProductsDao;
import com.vicky.entity.Category;
import com.vicky.entity.Products;
import com.vicky.impl.CategoryDaoImpl;
import com.vicky.impl.ProductsDaoImpl;

public class Tester {

	public static void main(String[] args) throws Exception {
         
		CategoryDao dao = new CategoryDaoImpl();
		
		ProductsDao productdao = new ProductsDaoImpl();
		
		Category cat = new Category();
		cat.setCategoryId(101);
		cat.setCategoryName("Animal");
		cat.setCategoryPrice(2000.00);
		
		dao.saveCategory(cat);
		
		
		Products animal = new Products();
		animal.setProductId(101);
		animal.setProductName("Cat");
		animal.setProductPrice(2000.00);
		animal.setCategoryId(101);
		
		productdao.saveProducts(animal);
        
/*		File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\AshokIT Notes\\cat.jpeg");
//	
//		
//		FileInputStream fis = new FileInputStream(f);
        fis.
 */       
	}

}
