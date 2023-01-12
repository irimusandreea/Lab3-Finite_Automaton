# Lab3-Finite_Automaton
- Documentation -

q0 q1 q2\
0 1\
q0\
q2\
q0 0 q0\
q0 1 q1\
q1 0 q2\
q1 1 q1\
q2 0 q2\
q2 1 q2

Language definitions:\
	Letter ::= “a”|…|”z”\
	Digit ::= “0”|…|”9”\
	PositiveDigit ::= “1”|…|”9”\
	Number ::= PositiveDigit {Digit} | Digit\
	Alphabet ::= Letter Number\
	Separator ::= “ “
  
Syntax:\
	Structure ::= States Inputs InitialState FinalState {Transition}\
	Inputs ::= {Digit Separator}\
        States ::= {Alphabet Separator}\
	InitialState ::= Alphabet\
	Final state ::= Alphabet\
	Transition ::= States ”->” Alphabet ”=” States
