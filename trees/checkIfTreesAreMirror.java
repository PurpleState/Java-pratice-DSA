public class checkIfTreesAreMirror {
    public boolean areM(BinaryTreeNode  root1, BinaryTreeNode  root2) {
    	if(root1 == null && root2 == null) 	
            return true;
    	if(root1 == null || root2 == null) 
            return false;
    	if(root1.data != root2.data) 
             return false;
    	else return (areM(root1.getLeft(), root2.right) && areM(root1.right, root2.getLeft()));
     }
}
