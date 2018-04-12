
package springapp.web;

import org.springframework.web.servlet.ModelAndView;
import springapp.web.HelloController;
import junit.framework.TestCase;


public class HelloControllerTests extends TestCase
{
	public void testHandleRequestView() throws Exception
	{
		
		// initial Basic # 1 
		/*HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		//System.out.println(modelAndView.getViewName());
		assertEquals("hello.jsp", modelAndView.getViewName());*/
		
		// initial Basic # 2
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		//added when using view resolver of Jstl	
		assertEquals("hello", modelAndView.getViewName());
		//assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		String nowValue = (String) modelAndView.getModel().get("now");
		assertNotNull(nowValue);
	}
}