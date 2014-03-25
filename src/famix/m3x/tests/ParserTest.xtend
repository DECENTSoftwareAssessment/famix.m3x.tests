package famix.m3x.tests
import org.eclipse.xtext.junit4.XtextRunner
import famix.M3xInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.junit.Test
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import AbstractDECENTProvider.Model
import AbstractDECENTProvider.AbstractElement

@InjectWith(M3xInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
 	@Inject extension
	ParseHelper<Model> parser
	@Test 
	def void parseDomainmodel() {
	  val model = parser.parse(
	    "("+
		 "(FAMIX.Namespace (id: 1624)"+
		 	"(name 'KIO')"+
		 ")"+
		 ")")
	  val entity = model.elements.head as AbstractElement
	  
	  assertSame(entity, entity.eClass.name)
	}
	
	def assertSame(AbstractElement element, Object object) {
		println(element + " of type "+ object);
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}