package problem1;

	import java.util.Stack;

	public class balancingbrackets {

		public static void main(String[] args) {
			//String input="([[{}]])";
			String input="([[{}]]))";
			boolean result=checkbalancedbracket(input);

			if (result) {
				System.out.println("The entered String has Balanced Bracket");	
			} else {
				System.out.println("The entered String do not contain Balanced Bracket");	
			}
		}
		static boolean checkbalancedbracket(String input) {
			Stack <Character> Stack = new Stack<>();
			for (int i=0;i<input.length();i++) {
				char c=input.charAt(i);
				// for open bracket check
				if (c=='('||c=='{'||c=='[') {
					Stack.push(c);
					continue;
				}
				//if only closed bracket exist
				if(Stack.isEmpty()) {
					return false;
				}
				char temp;
				switch(c){
				case ')':
					temp=Stack.pop();
					if (temp=='{'||temp=='[') {
						return false;
					}
					break;
				case '}':
					temp=Stack.pop();
					if (temp=='('||temp=='[') {
						return false;
					}
					break;
				case ']':
					temp=Stack.pop();
					if (temp=='{'||temp=='(') {
						return false;
					}
					break;
				default:
					System.out.println("Not a correct bracket type");

				}
			}
			return Stack.isEmpty();



		}
	}


