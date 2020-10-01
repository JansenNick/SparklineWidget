// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class EarningsNPE
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject earningsNPEMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.EarningsNPE";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Year("Year"),
		n1("n1"),
		n2("n2"),
		n3("n3"),
		n4("n4"),
		n5("n5"),
		n6("n6"),
		n7("n7"),
		n8("n8"),
		n9("n9"),
		n10("n10"),
		n11("n11"),
		n12("n12"),
		n13("n13"),
		n14("n14"),
		n15("n15"),
		n16("n16"),
		n17("n17"),
		n18("n18"),
		n19("n19"),
		n20("n20");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public EarningsNPE(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.EarningsNPE"));
	}

	protected EarningsNPE(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject earningsNPEMendixObject)
	{
		if (earningsNPEMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.EarningsNPE", earningsNPEMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.EarningsNPE");

		this.earningsNPEMendixObject = earningsNPEMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'EarningsNPE.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.EarningsNPE initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.EarningsNPE.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.EarningsNPE initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.EarningsNPE(context, mendixObject);
	}

	public static myfirstmodule.proxies.EarningsNPE load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.EarningsNPE.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Year
	 */
	public final java.lang.Integer getYear()
	{
		return getYear(getContext());
	}

	/**
	 * @param context
	 * @return value of Year
	 */
	public final java.lang.Integer getYear(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Year.toString());
	}

	/**
	 * Set value of Year
	 * @param year
	 */
	public final void setYear(java.lang.Integer year)
	{
		setYear(getContext(), year);
	}

	/**
	 * Set value of Year
	 * @param context
	 * @param year
	 */
	public final void setYear(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer year)
	{
		getMendixObject().setValue(context, MemberNames.Year.toString(), year);
	}

	/**
	 * @return value of n1
	 */
	public final java.lang.Integer getn1()
	{
		return getn1(getContext());
	}

	/**
	 * @param context
	 * @return value of n1
	 */
	public final java.lang.Integer getn1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n1.toString());
	}

	/**
	 * Set value of n1
	 * @param n1
	 */
	public final void setn1(java.lang.Integer n1)
	{
		setn1(getContext(), n1);
	}

	/**
	 * Set value of n1
	 * @param context
	 * @param n1
	 */
	public final void setn1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n1)
	{
		getMendixObject().setValue(context, MemberNames.n1.toString(), n1);
	}

	/**
	 * @return value of n2
	 */
	public final java.lang.Integer getn2()
	{
		return getn2(getContext());
	}

	/**
	 * @param context
	 * @return value of n2
	 */
	public final java.lang.Integer getn2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n2.toString());
	}

	/**
	 * Set value of n2
	 * @param n2
	 */
	public final void setn2(java.lang.Integer n2)
	{
		setn2(getContext(), n2);
	}

	/**
	 * Set value of n2
	 * @param context
	 * @param n2
	 */
	public final void setn2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n2)
	{
		getMendixObject().setValue(context, MemberNames.n2.toString(), n2);
	}

	/**
	 * @return value of n3
	 */
	public final java.lang.Integer getn3()
	{
		return getn3(getContext());
	}

	/**
	 * @param context
	 * @return value of n3
	 */
	public final java.lang.Integer getn3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n3.toString());
	}

	/**
	 * Set value of n3
	 * @param n3
	 */
	public final void setn3(java.lang.Integer n3)
	{
		setn3(getContext(), n3);
	}

	/**
	 * Set value of n3
	 * @param context
	 * @param n3
	 */
	public final void setn3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n3)
	{
		getMendixObject().setValue(context, MemberNames.n3.toString(), n3);
	}

	/**
	 * @return value of n4
	 */
	public final java.lang.Integer getn4()
	{
		return getn4(getContext());
	}

	/**
	 * @param context
	 * @return value of n4
	 */
	public final java.lang.Integer getn4(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n4.toString());
	}

	/**
	 * Set value of n4
	 * @param n4
	 */
	public final void setn4(java.lang.Integer n4)
	{
		setn4(getContext(), n4);
	}

	/**
	 * Set value of n4
	 * @param context
	 * @param n4
	 */
	public final void setn4(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n4)
	{
		getMendixObject().setValue(context, MemberNames.n4.toString(), n4);
	}

	/**
	 * @return value of n5
	 */
	public final java.lang.Integer getn5()
	{
		return getn5(getContext());
	}

	/**
	 * @param context
	 * @return value of n5
	 */
	public final java.lang.Integer getn5(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n5.toString());
	}

	/**
	 * Set value of n5
	 * @param n5
	 */
	public final void setn5(java.lang.Integer n5)
	{
		setn5(getContext(), n5);
	}

	/**
	 * Set value of n5
	 * @param context
	 * @param n5
	 */
	public final void setn5(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n5)
	{
		getMendixObject().setValue(context, MemberNames.n5.toString(), n5);
	}

	/**
	 * @return value of n6
	 */
	public final java.lang.Integer getn6()
	{
		return getn6(getContext());
	}

	/**
	 * @param context
	 * @return value of n6
	 */
	public final java.lang.Integer getn6(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n6.toString());
	}

	/**
	 * Set value of n6
	 * @param n6
	 */
	public final void setn6(java.lang.Integer n6)
	{
		setn6(getContext(), n6);
	}

	/**
	 * Set value of n6
	 * @param context
	 * @param n6
	 */
	public final void setn6(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n6)
	{
		getMendixObject().setValue(context, MemberNames.n6.toString(), n6);
	}

	/**
	 * @return value of n7
	 */
	public final java.lang.Integer getn7()
	{
		return getn7(getContext());
	}

	/**
	 * @param context
	 * @return value of n7
	 */
	public final java.lang.Integer getn7(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n7.toString());
	}

	/**
	 * Set value of n7
	 * @param n7
	 */
	public final void setn7(java.lang.Integer n7)
	{
		setn7(getContext(), n7);
	}

	/**
	 * Set value of n7
	 * @param context
	 * @param n7
	 */
	public final void setn7(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n7)
	{
		getMendixObject().setValue(context, MemberNames.n7.toString(), n7);
	}

	/**
	 * @return value of n8
	 */
	public final java.lang.Integer getn8()
	{
		return getn8(getContext());
	}

	/**
	 * @param context
	 * @return value of n8
	 */
	public final java.lang.Integer getn8(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n8.toString());
	}

	/**
	 * Set value of n8
	 * @param n8
	 */
	public final void setn8(java.lang.Integer n8)
	{
		setn8(getContext(), n8);
	}

	/**
	 * Set value of n8
	 * @param context
	 * @param n8
	 */
	public final void setn8(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n8)
	{
		getMendixObject().setValue(context, MemberNames.n8.toString(), n8);
	}

	/**
	 * @return value of n9
	 */
	public final java.lang.Integer getn9()
	{
		return getn9(getContext());
	}

	/**
	 * @param context
	 * @return value of n9
	 */
	public final java.lang.Integer getn9(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n9.toString());
	}

	/**
	 * Set value of n9
	 * @param n9
	 */
	public final void setn9(java.lang.Integer n9)
	{
		setn9(getContext(), n9);
	}

	/**
	 * Set value of n9
	 * @param context
	 * @param n9
	 */
	public final void setn9(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n9)
	{
		getMendixObject().setValue(context, MemberNames.n9.toString(), n9);
	}

	/**
	 * @return value of n10
	 */
	public final java.lang.Integer getn10()
	{
		return getn10(getContext());
	}

	/**
	 * @param context
	 * @return value of n10
	 */
	public final java.lang.Integer getn10(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n10.toString());
	}

	/**
	 * Set value of n10
	 * @param n10
	 */
	public final void setn10(java.lang.Integer n10)
	{
		setn10(getContext(), n10);
	}

	/**
	 * Set value of n10
	 * @param context
	 * @param n10
	 */
	public final void setn10(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n10)
	{
		getMendixObject().setValue(context, MemberNames.n10.toString(), n10);
	}

	/**
	 * @return value of n11
	 */
	public final java.lang.Integer getn11()
	{
		return getn11(getContext());
	}

	/**
	 * @param context
	 * @return value of n11
	 */
	public final java.lang.Integer getn11(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n11.toString());
	}

	/**
	 * Set value of n11
	 * @param n11
	 */
	public final void setn11(java.lang.Integer n11)
	{
		setn11(getContext(), n11);
	}

	/**
	 * Set value of n11
	 * @param context
	 * @param n11
	 */
	public final void setn11(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n11)
	{
		getMendixObject().setValue(context, MemberNames.n11.toString(), n11);
	}

	/**
	 * @return value of n12
	 */
	public final java.lang.Integer getn12()
	{
		return getn12(getContext());
	}

	/**
	 * @param context
	 * @return value of n12
	 */
	public final java.lang.Integer getn12(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n12.toString());
	}

	/**
	 * Set value of n12
	 * @param n12
	 */
	public final void setn12(java.lang.Integer n12)
	{
		setn12(getContext(), n12);
	}

	/**
	 * Set value of n12
	 * @param context
	 * @param n12
	 */
	public final void setn12(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n12)
	{
		getMendixObject().setValue(context, MemberNames.n12.toString(), n12);
	}

	/**
	 * @return value of n13
	 */
	public final java.lang.Integer getn13()
	{
		return getn13(getContext());
	}

	/**
	 * @param context
	 * @return value of n13
	 */
	public final java.lang.Integer getn13(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n13.toString());
	}

	/**
	 * Set value of n13
	 * @param n13
	 */
	public final void setn13(java.lang.Integer n13)
	{
		setn13(getContext(), n13);
	}

	/**
	 * Set value of n13
	 * @param context
	 * @param n13
	 */
	public final void setn13(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n13)
	{
		getMendixObject().setValue(context, MemberNames.n13.toString(), n13);
	}

	/**
	 * @return value of n14
	 */
	public final java.lang.Integer getn14()
	{
		return getn14(getContext());
	}

	/**
	 * @param context
	 * @return value of n14
	 */
	public final java.lang.Integer getn14(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n14.toString());
	}

	/**
	 * Set value of n14
	 * @param n14
	 */
	public final void setn14(java.lang.Integer n14)
	{
		setn14(getContext(), n14);
	}

	/**
	 * Set value of n14
	 * @param context
	 * @param n14
	 */
	public final void setn14(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n14)
	{
		getMendixObject().setValue(context, MemberNames.n14.toString(), n14);
	}

	/**
	 * @return value of n15
	 */
	public final java.lang.Integer getn15()
	{
		return getn15(getContext());
	}

	/**
	 * @param context
	 * @return value of n15
	 */
	public final java.lang.Integer getn15(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n15.toString());
	}

	/**
	 * Set value of n15
	 * @param n15
	 */
	public final void setn15(java.lang.Integer n15)
	{
		setn15(getContext(), n15);
	}

	/**
	 * Set value of n15
	 * @param context
	 * @param n15
	 */
	public final void setn15(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n15)
	{
		getMendixObject().setValue(context, MemberNames.n15.toString(), n15);
	}

	/**
	 * @return value of n16
	 */
	public final java.lang.Integer getn16()
	{
		return getn16(getContext());
	}

	/**
	 * @param context
	 * @return value of n16
	 */
	public final java.lang.Integer getn16(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n16.toString());
	}

	/**
	 * Set value of n16
	 * @param n16
	 */
	public final void setn16(java.lang.Integer n16)
	{
		setn16(getContext(), n16);
	}

	/**
	 * Set value of n16
	 * @param context
	 * @param n16
	 */
	public final void setn16(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n16)
	{
		getMendixObject().setValue(context, MemberNames.n16.toString(), n16);
	}

	/**
	 * @return value of n17
	 */
	public final java.lang.Integer getn17()
	{
		return getn17(getContext());
	}

	/**
	 * @param context
	 * @return value of n17
	 */
	public final java.lang.Integer getn17(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n17.toString());
	}

	/**
	 * Set value of n17
	 * @param n17
	 */
	public final void setn17(java.lang.Integer n17)
	{
		setn17(getContext(), n17);
	}

	/**
	 * Set value of n17
	 * @param context
	 * @param n17
	 */
	public final void setn17(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n17)
	{
		getMendixObject().setValue(context, MemberNames.n17.toString(), n17);
	}

	/**
	 * @return value of n18
	 */
	public final java.lang.Integer getn18()
	{
		return getn18(getContext());
	}

	/**
	 * @param context
	 * @return value of n18
	 */
	public final java.lang.Integer getn18(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n18.toString());
	}

	/**
	 * Set value of n18
	 * @param n18
	 */
	public final void setn18(java.lang.Integer n18)
	{
		setn18(getContext(), n18);
	}

	/**
	 * Set value of n18
	 * @param context
	 * @param n18
	 */
	public final void setn18(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n18)
	{
		getMendixObject().setValue(context, MemberNames.n18.toString(), n18);
	}

	/**
	 * @return value of n19
	 */
	public final java.lang.Integer getn19()
	{
		return getn19(getContext());
	}

	/**
	 * @param context
	 * @return value of n19
	 */
	public final java.lang.Integer getn19(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n19.toString());
	}

	/**
	 * Set value of n19
	 * @param n19
	 */
	public final void setn19(java.lang.Integer n19)
	{
		setn19(getContext(), n19);
	}

	/**
	 * Set value of n19
	 * @param context
	 * @param n19
	 */
	public final void setn19(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n19)
	{
		getMendixObject().setValue(context, MemberNames.n19.toString(), n19);
	}

	/**
	 * @return value of n20
	 */
	public final java.lang.Integer getn20()
	{
		return getn20(getContext());
	}

	/**
	 * @param context
	 * @return value of n20
	 */
	public final java.lang.Integer getn20(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.n20.toString());
	}

	/**
	 * Set value of n20
	 * @param n20
	 */
	public final void setn20(java.lang.Integer n20)
	{
		setn20(getContext(), n20);
	}

	/**
	 * Set value of n20
	 * @param context
	 * @param n20
	 */
	public final void setn20(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n20)
	{
		getMendixObject().setValue(context, MemberNames.n20.toString(), n20);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return earningsNPEMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.EarningsNPE that = (myfirstmodule.proxies.EarningsNPE) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.EarningsNPE";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
