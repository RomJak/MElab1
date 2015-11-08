/**
 */
package views.tests;

import junit.textui.TestRunner;

import views.NonNavigableAssociationEnd;
import views.ViewsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Non Navigable Association End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NonNavigableAssociationEndTest extends AssociationEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NonNavigableAssociationEndTest.class);
	}

	/**
	 * Constructs a new Non Navigable Association End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNavigableAssociationEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Non Navigable Association End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NonNavigableAssociationEnd getFixture() {
		return (NonNavigableAssociationEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewsFactory.eINSTANCE.createNonNavigableAssociationEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NonNavigableAssociationEndTest
