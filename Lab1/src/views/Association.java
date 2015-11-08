/**
 */
package views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Association#getName <em>Name</em>}</li>
 *   <li>{@link views.Association#getNonnavigableassociationend <em>Nonnavigableassociationend</em>}</li>
 *   <li>{@link views.Association#getNavigableassociationend <em>Navigableassociationend</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see views.ViewsPackage#getAssociation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link views.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nonnavigableassociationend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonnavigableassociationend</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonnavigableassociationend</em>' containment reference.
	 * @see #setNonnavigableassociationend(NonNavigableAssociationEnd)
	 * @see views.ViewsPackage#getAssociation_Nonnavigableassociationend()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonNavigableAssociationEnd getNonnavigableassociationend();

	/**
	 * Sets the value of the '{@link views.Association#getNonnavigableassociationend <em>Nonnavigableassociationend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonnavigableassociationend</em>' containment reference.
	 * @see #getNonnavigableassociationend()
	 * @generated
	 */
	void setNonnavigableassociationend(NonNavigableAssociationEnd value);

	/**
	 * Returns the value of the '<em><b>Navigableassociationend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigableassociationend</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigableassociationend</em>' containment reference.
	 * @see #setNavigableassociationend(NavigableAssociationEnd)
	 * @see views.ViewsPackage#getAssociation_Navigableassociationend()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NavigableAssociationEnd getNavigableassociationend();

	/**
	 * Sets the value of the '{@link views.Association#getNavigableassociationend <em>Navigableassociationend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigableassociationend</em>' containment reference.
	 * @see #getNavigableassociationend()
	 * @generated
	 */
	void setNavigableassociationend(NavigableAssociationEnd value);

} // Association
