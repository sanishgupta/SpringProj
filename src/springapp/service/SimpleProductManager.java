
package springapp.service;

import java.util.List;
import springapp.domain.Product;
import springapp.repository.ProductDao;


public class SimpleProductManager implements ProductManager
{
	/**
	 * serialVersionUID
	 */
	private static final long	serialVersionUID	= 3219550845709344766L;

	// private List<Product> products;
	private ProductDao			productDao;

	public List<Product> getProducts()
	{
		// throw new UnsupportedOperationException();
		// return products;
		return productDao.getProductList();
	}

	public void increasePrice(int percentage)
	{
		// throw new UnsupportedOperationException();
		List<Product> products = productDao.getProductList();
		if ( products != null )
		{
			for (Product product : products)
			{
				double newPrice = product.getPrice().doubleValue() *
						(100 + percentage) / 100;
				product.setPrice(newPrice);
				productDao.saveProduct(product);
			}
		}
	}

	public void setProductDao(ProductDao productDao)
	{
		this.productDao = productDao;
	}
	/*
	 * public void setProducts(List<Product> products) { // throw new
	 * UnsupportedOperationException(); this.products = products; }
	 */
}