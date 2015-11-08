/**
 */
package views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.DomainModel#getNamedtypes <em>Namedtypes</em>}</li>
 *   <li>{@link views.DomainModel#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Namedtypes</b></em>' containment reference list.
	 * The list contents are of type {@link views.NamedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namedtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namedtypes</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_Namedtypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedType> getNamedtypes();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link views.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<views.Class> getClasses();

} // DomainModel
