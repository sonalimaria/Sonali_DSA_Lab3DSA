package problem2;
import java.util.HashSet;
		import java.util.Set;

		public class FindSumPair {

			public static void main(String[] args) {
				//created tree
				Node root=null;
				Node node=new Node();

				root=node.insert(root,40);
				root=node.insert(root,20);
				root=node.insert(root,60);
				root=node.insert(root,10);
				root=node.insert(root,30);
				root=node.insert(root,50);
				root=node.insert(root,70);
			
		        FindSumPair findSumPair=new FindSumPair();
				//pass tree as parameter
				findSumPair.findPairWithSum(root,130);
			}
			public void findPairWithSum(Node root,int sum) {
				Set<Integer> set=new HashSet<>();
				if (!findPairUtil(root,sum,set)) {
					System.out.println("Pair not found");
				}
			} 
			public boolean findPairUtil(Node root,int sum, Set<Integer>set) {
				if(root==null) {
					return false;
				}
				if (findPairUtil(root.left,sum, set)) {
					return true;
				}
				if(set.contains(sum-root.value)) {
					System.out.println("pair which has sum as 130 is:-");
					System.out.println("Pair is:"+root.value+":"+(sum-root.value));
					return true;
				}else {
					set.add(root.value);
				}
				return findPairUtil(root.right,sum, set);

			}
		}
