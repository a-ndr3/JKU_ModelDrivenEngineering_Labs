<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="OptToReq"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchOptToReqRule():V"/>
		<constant value="__exec__"/>
		<constant value="OptToReqRule"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyOptToReqRule(NTransientLink;):V"/>
		<constant value="__matchOptToReqRule"/>
		<constant value="Option"/>
		<constant value="RequirementsNegociation"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="votes"/>
		<constant value="agreement"/>
		<constant value="J.=(J):J"/>
		<constant value="B.and(B):B"/>
		<constant value="B.not():B"/>
		<constant value="40"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="o"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="r"/>
		<constant value="Requirement"/>
		<constant value="RequirementsSpecification"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="9:41-9:42"/>
		<constant value="9:41-9:48"/>
		<constant value="9:61-9:62"/>
		<constant value="9:61-9:72"/>
		<constant value="9:75-9:79"/>
		<constant value="9:61-9:79"/>
		<constant value="9:41-9:80"/>
		<constant value="11:5-15:6"/>
		<constant value="v"/>
		<constant value="__applyOptToReqRule"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="id"/>
		<constant value="description"/>
		<constant value="J.size():J"/>
		<constant value="0"/>
		<constant value="J.&gt;(J):J"/>
		<constant value="31"/>
		<constant value="47"/>
		<constant value="4"/>
		<constant value="importance"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.sum():J"/>
		<constant value="J.div(J):J"/>
		<constant value="12:13-12:14"/>
		<constant value="12:13-12:17"/>
		<constant value="12:7-12:17"/>
		<constant value="13:22-13:23"/>
		<constant value="13:22-13:35"/>
		<constant value="13:7-13:35"/>
		<constant value="14:24-14:25"/>
		<constant value="14:24-14:31"/>
		<constant value="14:24-14:39"/>
		<constant value="14:42-14:43"/>
		<constant value="14:24-14:43"/>
		<constant value="14:117-14:118"/>
		<constant value="14:49-14:50"/>
		<constant value="14:49-14:56"/>
		<constant value="14:70-14:71"/>
		<constant value="14:70-14:82"/>
		<constant value="14:49-14:83"/>
		<constant value="14:49-14:90"/>
		<constant value="14:95-14:96"/>
		<constant value="14:95-14:102"/>
		<constant value="14:95-14:110"/>
		<constant value="14:49-14:111"/>
		<constant value="14:21-14:124"/>
		<constant value="14:7-14:124"/>
		<constant value="link"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<pusht/>
			<load arg="19"/>
			<get arg="50"/>
			<iterate/>
			<store arg="29"/>
			<load arg="29"/>
			<get arg="51"/>
			<pusht/>
			<call arg="52"/>
			<call arg="53"/>
			<enditerate/>
			<call arg="54"/>
			<if arg="55"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="61"/>
			<push arg="62"/>
			<new/>
			<pcall arg="63"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="65" begin="8" end="8"/>
			<lne id="66" begin="8" end="9"/>
			<lne id="67" begin="12" end="12"/>
			<lne id="68" begin="12" end="13"/>
			<lne id="69" begin="14" end="14"/>
			<lne id="70" begin="12" end="15"/>
			<lne id="71" begin="7" end="17"/>
			<lne id="72" begin="32" end="37"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="73" begin="11" end="16"/>
			<lve slot="1" name="58" begin="6" end="39"/>
			<lve slot="0" name="17" begin="0" end="40"/>
		</localvariabletable>
	</operation>
	<operation name="74">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="75"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="76"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="77"/>
			<store arg="78"/>
			<load arg="78"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="79"/>
			<call arg="30"/>
			<set arg="79"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="80"/>
			<call arg="30"/>
			<set arg="80"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="50"/>
			<call arg="81"/>
			<pushi arg="82"/>
			<call arg="83"/>
			<if arg="84"/>
			<pushi arg="82"/>
			<goto arg="85"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="50"/>
			<iterate/>
			<store arg="86"/>
			<load arg="86"/>
			<get arg="87"/>
			<call arg="88"/>
			<enditerate/>
			<call arg="89"/>
			<load arg="29"/>
			<get arg="50"/>
			<call arg="81"/>
			<call arg="90"/>
			<call arg="30"/>
			<set arg="87"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="91" begin="11" end="11"/>
			<lne id="92" begin="11" end="12"/>
			<lne id="93" begin="9" end="14"/>
			<lne id="94" begin="17" end="17"/>
			<lne id="95" begin="17" end="18"/>
			<lne id="96" begin="15" end="20"/>
			<lne id="97" begin="23" end="23"/>
			<lne id="98" begin="23" end="24"/>
			<lne id="99" begin="23" end="25"/>
			<lne id="100" begin="26" end="26"/>
			<lne id="101" begin="23" end="27"/>
			<lne id="102" begin="29" end="29"/>
			<lne id="103" begin="34" end="34"/>
			<lne id="104" begin="34" end="35"/>
			<lne id="105" begin="38" end="38"/>
			<lne id="106" begin="38" end="39"/>
			<lne id="107" begin="31" end="41"/>
			<lne id="108" begin="31" end="42"/>
			<lne id="109" begin="43" end="43"/>
			<lne id="110" begin="43" end="44"/>
			<lne id="111" begin="43" end="45"/>
			<lne id="112" begin="31" end="46"/>
			<lne id="113" begin="23" end="46"/>
			<lne id="114" begin="21" end="48"/>
			<lne id="72" begin="8" end="49"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="73" begin="37" end="40"/>
			<lve slot="3" name="60" begin="7" end="49"/>
			<lve slot="2" name="58" begin="3" end="49"/>
			<lve slot="0" name="17" begin="0" end="49"/>
			<lve slot="1" name="115" begin="0" end="49"/>
		</localvariabletable>
	</operation>
</asm>
