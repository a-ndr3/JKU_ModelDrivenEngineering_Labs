<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="StakesToAct"/>
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
		<constant value="A.__matchStakeholder2Actor():V"/>
		<constant value="__exec__"/>
		<constant value="Stakeholder2Actor"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyStakeholder2Actor(NTransientLink;):V"/>
		<constant value="__matchStakeholder2Actor"/>
		<constant value="Stakeholder"/>
		<constant value="RequirementsNegociation"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="pos"/>
		<constant value="tester"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="developer"/>
		<constant value="user"/>
		<constant value="client"/>
		<constant value="NTransientLink;.addVariable(SJ):V"/>
		<constant value="a"/>
		<constant value="Actor"/>
		<constant value="RequirementsSpecification"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="19:39-19:47"/>
		<constant value="19:48-19:59"/>
		<constant value="19:60-19:66"/>
		<constant value="19:67-19:75"/>
		<constant value="19:30-19:76"/>
		<constant value="22:63-22:66"/>
		<constant value="22:5-24:6"/>
		<constant value="__applyStakeholder2Actor"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="NTransientLink;.getVariable(S):J"/>
		<constant value="4"/>
		<constant value="5"/>
		<constant value="CJ.asSequence():QJ"/>
		<constant value="6"/>
		<constant value="QJ.at(I):J"/>
		<constant value="7"/>
		<constant value="B.not():B"/>
		<constant value="34"/>
		<constant value="role"/>
		<constant value="I.+(I):I"/>
		<constant value="23:15-23:16"/>
		<constant value="23:7-23:16"/>
		<constant value="p"/>
		<constant value="collection"/>
		<constant value="counter"/>
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
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="51"/>
			<dup/>
			<push arg="52"/>
			<load arg="19"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<push arg="55"/>
			<call arg="56"/>
			<push arg="57"/>
			<call arg="56"/>
			<push arg="58"/>
			<call arg="56"/>
			<push arg="59"/>
			<call arg="56"/>
			<dup/>
			<store arg="29"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<iterate/>
			<pop/>
			<push arg="62"/>
			<push arg="63"/>
			<new/>
			<call arg="56"/>
			<enditerate/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="66" begin="24" end="24"/>
			<lne id="67" begin="26" end="26"/>
			<lne id="68" begin="28" end="28"/>
			<lne id="69" begin="30" end="30"/>
			<lne id="70" begin="21" end="31"/>
			<lne id="71" begin="40" end="40"/>
			<lne id="72" begin="35" end="48"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="54" begin="33" end="48"/>
			<lve slot="1" name="52" begin="6" end="50"/>
			<lve slot="0" name="17" begin="0" end="51"/>
		</localvariabletable>
	</operation>
	<operation name="73">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="74"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="52"/>
			<call arg="75"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="76"/>
			<store arg="77"/>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="78"/>
			<store arg="79"/>
			<pushi arg="19"/>
			<store arg="80"/>
			<load arg="79"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="77"/>
			<iterate/>
			<load arg="82"/>
			<load arg="80"/>
			<call arg="83"/>
			<store arg="84"/>
			<dup/>
			<getasm/>
			<load arg="84"/>
			<dup/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<call arg="85"/>
			<if arg="86"/>
			<load arg="80"/>
			<call arg="83"/>
			<call arg="30"/>
			<set arg="87"/>
			<pop/>
			<load arg="80"/>
			<pushi arg="19"/>
			<call arg="88"/>
			<store arg="80"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="71" begin="14" end="14"/>
			<lne id="89" begin="25" end="25"/>
			<lne id="90" begin="23" end="35"/>
			<lne id="72" begin="12" end="41"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="7" name="91" begin="22" end="35"/>
			<lve slot="6" name="92" begin="16" end="41"/>
			<lve slot="5" name="93" begin="13" end="41"/>
			<lve slot="4" name="54" begin="11" end="41"/>
			<lve slot="3" name="61" begin="7" end="41"/>
			<lve slot="2" name="52" begin="3" end="41"/>
			<lve slot="0" name="17" begin="0" end="41"/>
			<lve slot="1" name="94" begin="0" end="41"/>
		</localvariabletable>
	</operation>
</asm>
