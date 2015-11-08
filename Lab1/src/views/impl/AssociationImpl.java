/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import views.Association;
import views.NavigableAssociationEnd;
import views.NonNavigableAssociationEnd;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link views.impl.AssociationImpl#getNonnavigableassociationend <em>Nonnavigableassociationend</em>}</li>
 *   <li>{@link views.impl.AssociationImpl#getNavigableassociationend <em>Navigableassociationend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends MinimalEObjectImpl.Container implements Association {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNonnavigableassociationend() <em>Nonnavigableassociationend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonnavigableassociationend()
	 * @generated
	 * @ordered
	 */
	protected NonNavigableAssociationEnd nonnavigableassociationend;

	/**
	 * The cached value of the '{@link #getNavigableassociationend() <em>Navigableassociationend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableassociationend()
	 * @generated
	 * @ordered
	 */
	protected NavigableAssociationEnd navigableassociationend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNavigableAssociationEnd getNonnavigableassociationend() {
		return nonnavigableassociationend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonnavigableassociationend(NonNavigableAssociationEnd newNonnavigableassociationend, NotificationChain msgs) {
		NonNavigableAssociationEnd oldNonnavigableassociationend = nonnavigableassociationend;
		nonnavigableassociationend = newNonnavigableassociationend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND, oldNonnavigableassociationend, newNonnavigableassociationend);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonnavigableassociationend(NonNavigableAssociationEnd newNonnavigableassociationend) {
		if (newNonnavigableassociationend != nonnavigableassociationend) {
			NotificationChain msgs = null;
			if (nonnavigableassociationend != null)
				msgs = ((InternalEObject)nonnavigableassociationend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND, null, msgs);
			if (newNonnavigableassociationend != null)
				msgs = ((InternalEObject)newNonnavigableassociationend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND, null, msgs);
			msgs = basicSetNonnavigableassociationend(newNonnavigableassociationend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND, newNonnavigableassociationend, newNonnavigableassociationend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigableAssociationEnd getNavigableassociationend() {
		return navigableassociationend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigableassociationend(NavigableAssociationEnd newNavigableassociationend, NotificationChain msgs) {
		NavigableAssociationEnd oldNavigableassociationend = navigableassociationend;
		navigableassociationend = newNavigableassociationend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND, oldNavigableassociationend, newNavigableassociationend);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigableassociationend(NavigableAssociationEnd newNavigableassociationend) {
		if (newNavigableassociationend != navigableassociationend) {
			NotificationChain msgs = null;
			if (navigableassociationend != null)
				msgs = ((InternalEObject)navigableassociationend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND, null, msgs);
			if (newNavigableassociationend != null)
				msgs = ((InternalEObject)newNavigableassociationend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND, null, msgs);
			msgs = basicSetNavigableassociationend(newNavigableassociationend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND, newNavigableassociationend, newNavigableassociationend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND:
				return basicSetNonnavigableassociationend(null, msgs);
			case ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND:
				return basicSetNavigableassociationend(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.ASSOCIATION__NAME:
				return getName();
			case ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND:
				return getNonnavigableassociationend();
			case ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND:
				return getNavigableassociationend();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND:
				setNonnavigableassociationend((NonNavigableAssociationEnd)newValue);
				return;
			case ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND:
				setNavigableassociationend((NavigableAssociationEnd)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND:
				setNonnavigableassociationend((NonNavigableAssociationEnd)null);
				return;
			case ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND:
				setNavigableassociationend((NavigableAssociationEnd)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ViewsPackage.ASSOCIATION__NONNAVIGABLEASSOCIATIONEND:
				return nonnavigableassociationend != null;
			case ViewsPackage.ASSOCIATION__NAVIGABLEASSOCIATIONEND:
				return navigableassociationend != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
