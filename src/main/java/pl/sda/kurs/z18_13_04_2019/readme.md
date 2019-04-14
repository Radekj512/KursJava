🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈
*REQUIREMENTS*

* Groovy
* Java 8

*BEFORE*

Clone this repository and run the AppTest to see if code works ok.
For every pattern there is a test written in the Groovy Spock with @PendingFeature annotation -> take a look here:

http://spockframework.org/spock/javadoc/1.1-SNAPSHOT/spock/lang/PendingFeature.html

If you change your code correctly, it means that you implement the feature and you will have to
remove the @PendingFeature annotation from existing test.

🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈
*Java Design Patterns*

*Creational Design Patterns* 

* Singleton
* Factory
* Abstract Factory
* Builder
* Prototype

*Structural Design Patterns* 

* Adapter
* Composite
* Proxy
* Flyweight
* Facade
* Bridge
* Decorator

*Behavioral Design Patterns*

* Template Method
* Strategy
* Observer
* State
* Visitor
* Iterator
* Memento
* Chain of Responsibility
* Command
* Interpreter
* Mediator

🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈
*TASKS RULES*

All of patterns mentioned above are partially developed. 
The main object of this workshops is to reach a DoD for every pattern implementation:
1. Implement pattern in suitable package.
2. If there is a basic implementation, extend it or fix the bugs.
3. Check if there are tests for this pattern implementation.
4. If tests exist - make sure that they'll be green.
5. If there is a @PendingImplementation on them -> remove it if you implementation has been done.
6. If there is no tests in the package, implement them using Junit.
7. Change TODO which you already implemented to DONE

🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈
*TASKS*

0.  Maven introduction
        Plugins
        Repository
    Spock introduction
        PendingFeature
        Given/When/Then
        Expect
    Groovy introduction
        No ; at all!
    Lombok introduction
    Guava introduction
* Singleton
1. Read all existing implementations and fix existing bugs
2. Do 3 Implementations Property Loader to read connection.properties file
    a) Using ClassLoader
    b) Using Apache Commons CSV
    c) Using OpenCSV

* Factory
3. Take a look in the TheBestCarmaker and try to implement all todos

* Abstract Factory
4. Take a look on tasks which are in AbstractFactory class

* Builder
5. Implement builder and use builder which is in lombok

* Prototype
6. Please do all instructions which are in CarCache 

* Adapter
7. Fill the implementation and fix the bugs

* Composite
8. Fill the implementation and fix the bugs

* Proxy
9. Fill the implementation and fix the bugs

* Flyweight
10. Fill the implementation and fix the bugs

* Facade
11. Fill the implementation and fix the bugs

* Bridge
12. Take a look on Shape class and try to write the implementation

* Decorator
13. Fill the implementation and fix the bugs
14. Think about another example with burger order. You can order burger with extra chees, extra ham, without ham.
Your abstract class should have at least 2 methods (description of burger, additional costs)
Try to test the whole flow (order extra burger and calculate the price)

* Template Method
15. Fill the implementation and fix the bugs

* Strategy
16. Fill the implementation and fix the bugs

* Observer
17. Fill the implementation and fix the bugs

* State
18. Fill the implementation and fix the bugs

* Visitor
19. Fill the implementation and fix the bugs

* Iterator
20. Fill the implementation and fix the bugs

* Memento
21. Fill the implementation and fix the bugs

* Chain of Responsibility
22. Fill the implementation and fix the bugs

* Command
23. Fill the implementation and fix the bugs

* Interpreter
24. Fill the implementation and fix the bugs

* Mediator
25. Fill the implementation and fix the bugs

*EXTRA TASKS*

1. Try to use chuck norris api
https://api.chucknorris.io/

2. Integrate with it using: default http client
https://alvinalexander.com/java/java-apache-httpclient-restful-client-examples

3. Think which pattern would be good here to collect all the data and save it to the file

🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈
*LINKS*

* http://spockframework.org/
* http://groovy-lang.org/
* https://www.agilealliance.org/glossary/definition-of-done/

*KNOWLEDGE BASE*

* Flyweight vs Prototype

In Flyweight, object is immutable.
In Prototype, object is mutable.

Flyweight is about saving memory by not creating new objects and reusing existing ones when possible.
Prototype is about, reusing existing object in order to save cost of new object creation.

* Command vs Memento

Command -> object represents an action
Memento -> object represents a state

🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈🌈
*EXAMPLES*

`Creational patterns`

**Abstract factory** (returns the factory itself which in turn can be used to create another abstract/interface type)
* javax.xml.parsers.DocumentBuilderFactory#newInstance()
* javax.xml.transform.TransformerFactory#newInstance()
* javax.xml.xpath.XPathFactory#newInstance()

**Builder** (returns the instance itself)
* java.lang.StringBuilder#append() (unsynchronized)
* java.lang.StringBuffer#append() (synchronized)
* java.nio.ByteBuffer#put() (also on CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
* javax.swing.GroupLayout.Group#addComponent()
* All implementations of java.lang.Appendable
* java.util.stream.Stream.Builder

**Factory method** (returns an implementation of an abstract/interface type)
* java.util.Calendar#getInstance()
* java.util.ResourceBundle#getBundle()
* java.text.NumberFormat#getInstance()
* java.nio.charset.Charset#forName()
* java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Returns singleton object per protocol)
* java.util.EnumSet#of()
* javax.xml.bind.JAXBContext#createMarshaller() and other similar methods

**Prototype** (returns a different instance of itself with the same properties)
* java.lang.Object#clone() (the class has to implement java.lang.Cloneable)

**Singleton** (returns the same instance (usually of itself) everytime)
* java.lang.Runtime#getRuntime()
* java.awt.Desktop#getDesktop()
* java.lang.System#getSecurityManager()
 
`Structural patterns`

**Adapter** (takes an instance of different abstract/interface type and returning an implementation of own/another abstract/interface type which decorates/overrides the given instance)
* java.util.Arrays#asList()
* java.util.Collections#list()
* java.util.Collections#enumeration()
* java.io.InputStreamReader(InputStream) (returns a Reader)
* java.io.OutputStreamWriter(OutputStream) (returns a Writer)
* javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()

**Bridge** (takes an instance of different abstract/interface type and returning an implementation of own abstract/interface type which delegates/uses the given instance)
* None comes to mind yet. A fictive example would be new LinkedHashMap(LinkedHashSet<K>, List<V>) which returns an unmodifiable linked map which doesn't clone the items, but uses them. The java.util.Collections#newSetFromMap() and singletonXXX() methods however comes close.

**Composite** (takes an instance of same abstract/interface type into a tree structure)
* java.awt.Container#add(Component) (practically all over Swing thus)
* javax.faces.component.UIComponent#getChildren() (practically all over JSF UI thus)

**Decorator** (takes an instance of same abstract/interface type which adds additional behaviour)
* All subclasses of java.io.InputStream, OutputStream, Reader and Writer have a constructor taking an instance of same type.
* java.util.Collections, the checkedXXX(), synchronizedXXX() and unmodifiableXXX() methods.
* javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper
* javax.swing.JScrollPane

**Facade** (internally uses instances of different independent abstract/interface types)
* javax.faces.context.FacesContext, it internally uses among others the abstract/interface types LifeCycle, ViewHandler, NavigationHandler and many more without that the enduser has to worry about it (which are however overrideable by injection).
* javax.faces.context.ExternalContext, which internally uses ServletContext, HttpSession, HttpServletRequest, HttpServletResponse, etc.

**Flyweight** (returns a cached instance)
* java.lang.Integer#valueOf(int) (also on Boolean, Byte, Character, Short, Long, BigDecimal)

**Proxy** (returns an implementation of given abstract/interface type which in turn delegates/uses a different implementation of given abstract/interface type)
* java.lang.reflect.Proxy
* java.rmi.*
* javax.ejb.EJB (explanation here)
* javax.inject.Inject (explanation here)
* javax.persistence.PersistenceContext
 
`Behavioral patterns`

**Chain of responsibility** ((indirectly) invokes the same method in another implementation of same abstract/interface type in a queue)
* java.util.logging.Logger#log()
* javax.servlet.Filter#doFilter()

**Command** (abstract/interface type which invokes a method in an implementation of a different abstract/interface type which has been encapsulated by the command implementation during its creation)
* All implementations of java.lang.Runnable
* All implementations of javax.swing.Action

**Interpreter** (returns a structurally different instance/type of the given instance/type; note that parsing/formatting is not part of the pattern, determining the pattern and how to apply it is)
* java.util.Pattern
* java.text.Normalizer
* All subclasses of java.text.Format
* All subclasses of javax.el.ELResolver

**Iterator** (sequentially returning instances of a different type from a queue)
* All implementations of java.util.Iterator (thus among others also java.util.Scanner!).
* All implementations of java.util.Enumeration

**Mediator** (takes an instance of different abstract/interface type (usually using the command pattern) which delegates/uses the given instance)
* java.util.Timer (all scheduleXXX() methods)
* java.util.concurrent.Executor#execute()
* java.util.concurrent.ExecutorService (the invokeXXX() and submit() methods)
* java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)
* java.lang.reflect.Method#invoke()

**Memento** (internally changes the state of the whole instance)
* java.util.Date (the setter methods do that, Date is internally represented by a long value)
* All implementations of java.io.Serializable
* All implementations of javax.faces.component.StateHolder

**Observer** (or Publish/Subscribe) (invokes a method on an instance of another abstract/interface type, depending on own state)
* java.util.Observer/java.util.Observable (rarely used in real world though)
* All implementations of java.util.EventListener (practically all over Swing thus)
* javax.servlet.http.HttpSessionBindingListener
* javax.servlet.http.HttpSessionAttributeListener
* javax.faces.event.PhaseListener

**State** (method which changes its behaviour depending on the instance's state which can be controlled externally)
* javax.faces.lifecycle.LifeCycle#execute() (controlled by FacesServlet, the behaviour is dependent on current phase (state) of JSF lifecycle)

**Strategy** (in an abstract/interface type which invokes a method in an implementation of a different abstract/interface type which has been passed-in as method argument into the strategy implementation)
* java.util.Comparator#compare(), executed by among others Collections#sort().
* javax.servlet.http.HttpServlet, the service() and all doXXX() methods take HttpServletRequest and HttpServletResponse and the implementor has to process them (and not to get hold of them as instance variables!).
* javax.servlet.Filter#doFilter()

**Template method** (methods which already have a "default" behaviour defined by an abstract type)
* All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
* All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
* javax.servlet.http.HttpServlet, all the doXXX() methods by default sends a HTTP 405 "Method Not Allowed" error to the response. You're free to implement none or any of them.

**Visitor** (two different abstract/interface types which has methods defined which takes each the other abstract/interface type; the one actually calls the method of the other and the other executes the desired strategy on it)
* javax.lang.model.element.AnnotationValue and AnnotationValueVisitor
* javax.lang.model.element.Element and ElementVisitor
* javax.lang.model.type.TypeMirror and TypeVisitor
* java.nio.file.FileVisitor and SimpleFileVisitor
* javax.faces.component.visit.VisitContext and VisitCallback