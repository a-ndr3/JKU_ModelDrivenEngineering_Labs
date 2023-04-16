<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="AgreemRatioForEachIssue"/>
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
		<constant value="A.__matchGetRatioFromAgreem():V"/>
		<constant value="__exec__"/>
		<constant value="GetRatioFromAgreem"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyGetRatioFromAgreem(NTransientLink;):V"/>
		<constant value="getRatio"/>
		<constant value="MRequirementsNegociation!Issue;"/>
		<constant value="votes"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.size():J"/>
		<constant value="0"/>
		<constant value="J.&gt;(J):J"/>
		<constant value="19"/>
		<constant value="0.0"/>
		<constant value="47"/>
		<constant value="3"/>
		<constant value="4"/>
		<constant value="agreement"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="41"/>
		<constant value="J.div(J):J"/>
		<constant value="8:30-8:35"/>
		<constant value="8:30-8:41"/>
		<constant value="8:55-8:56"/>
		<constant value="8:55-8:62"/>
		<constant value="8:30-8:63"/>
		<constant value="8:30-8:71"/>
		<constant value="9:8-9:18"/>
		<constant value="9:21-9:22"/>
		<constant value="9:8-9:22"/>
		<constant value="12:7-12:10"/>
		<constant value="10:7-10:12"/>
		<constant value="10:7-10:18"/>
		<constant value="10:32-10:33"/>
		<constant value="10:32-10:39"/>
		<constant value="10:52-10:53"/>
		<constant value="10:52-10:63"/>
		<constant value="10:66-10:70"/>
		<constant value="10:52-10:70"/>
		<constant value="10:32-10:71"/>
		<constant value="10:7-10:72"/>
		<constant value="10:7-10:80"/>
		<constant value="10:85-10:95"/>
		<constant value="10:7-10:96"/>
		<constant value="9:5-13:10"/>
		<constant value="8:3-13:10"/>
		<constant value="o"/>
		<constant value="v"/>
		<constant value="totalVotes"/>
		<constant value="issue"/>
		<constant value="__matchGetRatioFromAgreem"/>
		<constant value="WinCondition"/>
		<constant value="RequirementsNegociation"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="Option"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="i"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="opt"/>
		<constant value="r"/>
		<constant value="Requirement"/>
		<constant value="RequirementsSpecification"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="20:5-25:6"/>
		<constant value="__applyGetRatioFromAgreem"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="id"/>
		<constant value="description"/>
		<constant value="5"/>
		<constant value="6"/>
		<constant value="importance"/>
		<constant value="J.sum():J"/>
		<constant value="rate"/>
		<constant value="22:13-22:14"/>
		<constant value="22:13-22:17"/>
		<constant value="22:7-22:17"/>
		<constant value="23:22-23:23"/>
		<constant value="23:22-23:35"/>
		<constant value="23:7-23:35"/>
		<constant value="24:15-24:18"/>
		<constant value="24:15-24:24"/>
		<constant value="24:38-24:39"/>
		<constant value="24:38-24:45"/>
		<constant value="24:59-24:60"/>
		<constant value="24:59-24:71"/>
		<constant value="24:38-24:72"/>
		<constant value="24:38-24:79"/>
		<constant value="24:15-24:80"/>
		<constant value="24:15-24:87"/>
		<constant value="24:7-24:87"/>
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
		<context type="46"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<get arg="47"/>
			<iterate/>
			<store arg="29"/>
			<load arg="29"/>
			<get arg="47"/>
			<call arg="48"/>
			<enditerate/>
			<call arg="49"/>
			<store arg="29"/>
			<load arg="29"/>
			<pushi arg="50"/>
			<call arg="51"/>
			<if arg="52"/>
			<pushd arg="53"/>
			<goto arg="54"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<get arg="47"/>
			<iterate/>
			<store arg="55"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="55"/>
			<get arg="47"/>
			<iterate/>
			<store arg="56"/>
			<load arg="56"/>
			<get arg="57"/>
			<pusht/>
			<call arg="58"/>
			<call arg="59"/>
			<if arg="60"/>
			<load arg="56"/>
			<call arg="48"/>
			<enditerate/>
			<call arg="48"/>
			<enditerate/>
			<call arg="49"/>
			<load arg="29"/>
			<call arg="61"/>
		</code>
		<linenumbertable>
			<lne id="62" begin="3" end="3"/>
			<lne id="63" begin="3" end="4"/>
			<lne id="64" begin="7" end="7"/>
			<lne id="65" begin="7" end="8"/>
			<lne id="66" begin="0" end="10"/>
			<lne id="67" begin="0" end="11"/>
			<lne id="68" begin="13" end="13"/>
			<lne id="69" begin="14" end="14"/>
			<lne id="70" begin="13" end="15"/>
			<lne id="71" begin="17" end="17"/>
			<lne id="72" begin="22" end="22"/>
			<lne id="73" begin="22" end="23"/>
			<lne id="74" begin="29" end="29"/>
			<lne id="75" begin="29" end="30"/>
			<lne id="76" begin="33" end="33"/>
			<lne id="77" begin="33" end="34"/>
			<lne id="78" begin="35" end="35"/>
			<lne id="79" begin="33" end="36"/>
			<lne id="80" begin="26" end="41"/>
			<lne id="81" begin="19" end="43"/>
			<lne id="82" begin="19" end="44"/>
			<lne id="83" begin="45" end="45"/>
			<lne id="84" begin="19" end="46"/>
			<lne id="85" begin="13" end="46"/>
			<lne id="86" begin="0" end="46"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="87" begin="6" end="9"/>
			<lve slot="4" name="88" begin="32" end="40"/>
			<lve slot="3" name="87" begin="25" end="42"/>
			<lve slot="2" name="89" begin="12" end="46"/>
			<lve slot="0" name="17" begin="0" end="46"/>
			<lve slot="1" name="90" begin="0" end="46"/>
		</localvariabletable>
	</operation>
	<operation name="91">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="92"/>
			<push arg="93"/>
			<findme/>
			<push arg="94"/>
			<call arg="95"/>
			<iterate/>
			<store arg="19"/>
			<push arg="96"/>
			<push arg="93"/>
			<findme/>
			<push arg="94"/>
			<call arg="95"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<get arg="1"/>
			<push arg="97"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="98"/>
			<dup/>
			<push arg="99"/>
			<load arg="19"/>
			<pcall arg="100"/>
			<dup/>
			<push arg="101"/>
			<load arg="29"/>
			<pcall arg="100"/>
			<dup/>
			<push arg="102"/>
			<push arg="103"/>
			<push arg="104"/>
			<new/>
			<pcall arg="105"/>
			<pusht/>
			<pcall arg="106"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="107" begin="30" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="99" begin="6" end="37"/>
			<lve slot="2" name="101" begin="13" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="108">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="109"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="99"/>
			<call arg="110"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="101"/>
			<call arg="110"/>
			<store arg="55"/>
			<load arg="19"/>
			<push arg="102"/>
			<call arg="111"/>
			<store arg="56"/>
			<load arg="56"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="112"/>
			<call arg="30"/>
			<set arg="112"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="113"/>
			<call arg="30"/>
			<set arg="113"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="55"/>
			<get arg="47"/>
			<iterate/>
			<store arg="114"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="114"/>
			<get arg="47"/>
			<iterate/>
			<store arg="115"/>
			<load arg="115"/>
			<get arg="116"/>
			<call arg="48"/>
			<enditerate/>
			<call arg="117"/>
			<call arg="48"/>
			<enditerate/>
			<call arg="117"/>
			<call arg="30"/>
			<set arg="118"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="119" begin="15" end="15"/>
			<lne id="120" begin="15" end="16"/>
			<lne id="121" begin="13" end="18"/>
			<lne id="122" begin="21" end="21"/>
			<lne id="123" begin="21" end="22"/>
			<lne id="124" begin="19" end="24"/>
			<lne id="125" begin="30" end="30"/>
			<lne id="126" begin="30" end="31"/>
			<lne id="127" begin="37" end="37"/>
			<lne id="128" begin="37" end="38"/>
			<lne id="129" begin="41" end="41"/>
			<lne id="130" begin="41" end="42"/>
			<lne id="131" begin="34" end="44"/>
			<lne id="132" begin="34" end="45"/>
			<lne id="133" begin="27" end="47"/>
			<lne id="134" begin="27" end="48"/>
			<lne id="135" begin="25" end="50"/>
			<lne id="107" begin="12" end="51"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="6" name="88" begin="40" end="43"/>
			<lve slot="5" name="87" begin="33" end="46"/>
			<lve slot="4" name="102" begin="11" end="51"/>
			<lve slot="2" name="99" begin="3" end="51"/>
			<lve slot="3" name="101" begin="7" end="51"/>
			<lve slot="0" name="17" begin="0" end="51"/>
			<lve slot="1" name="136" begin="0" end="51"/>
		</localvariabletable>
	</operation>
</asm>
