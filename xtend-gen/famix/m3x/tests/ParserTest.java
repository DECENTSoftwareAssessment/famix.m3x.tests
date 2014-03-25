package famix.m3x.tests;

import AbstractDECENTProvider.AbstractElement;
import AbstractDECENTProvider.Model;
import com.google.inject.Inject;
import famix.M3xInjectorProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(M3xInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> parser;
  
  @Test
  public void parseDomainmodel() {
    try {
      final Model model = this.parser.parse(
        (((("(" + 
          "(FAMIX.Namespace (id: 1624)") + 
          "(name \'KIO\')") + 
          ")") + 
          ")"));
      EList<AbstractElement> _elements = model.getElements();
      AbstractElement _head = IterableExtensions.<AbstractElement>head(_elements);
      final AbstractElement entity = ((AbstractElement) _head);
      EClass _eClass = entity.eClass();
      String _name = _eClass.getName();
      this.assertSame(entity, _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertSame(final AbstractElement element, final Object object) {
    String _plus = (element + " of type ");
    String _plus_1 = (_plus + object);
    InputOutput.<String>println(_plus_1);
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
