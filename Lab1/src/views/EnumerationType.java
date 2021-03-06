/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.EnumerationType#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends NamedType {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
	 * The list contents are of type {@link views.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference list.
	 * @see views.ViewsPackage#getEnumerationType_Literal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getLiteral();

} // EnumerationType
