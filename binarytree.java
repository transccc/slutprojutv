import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class binarytree<E> {
    BinaryNode<E> root;
    int size;
    private Comparator<E> comparator;
    public binarytree(){
        root = null;
        size = 0;
        comparator = null;
    }

    static class BinaryNode<E> {
		E element;
		BinaryNode<E> left;
		BinaryNode<E> right;

		private BinaryNode(E element) {
			this.element = element;
		}	
	}
    public boolean add(E e) {
		
		if(root == null){
			root = new BinaryNode<>(e);
			size++;
			return true;
		}
		return addR(root, e);
	}
	public BinaryNode<E> returnroot(){
		return root;
	}
    private boolean addR(BinaryNode<E> node, E e){
		if(comparator != null){
		int compare = comparator.compare(node.element, e);
		if(compare < 0){
			if(node.right == null){
				node.right = new BinaryNode<>(e);
				size++;
				return true;
			}
			else{
				return addR(node.right, e);
			}

		}
		else if(compare > 0){
			if(node.left == null){
				node.left = new BinaryNode<>(e);
				size++;
				return true;
			}
			else{
				return addR(node.left, e);
			}
		}
		else{
			return false;
		}}
		else{
			
				int compare = ((Comparable<E>) node.element).compareTo(e);;
				if(compare < 0){
					if(node.right == null){
						node.right = new BinaryNode<>(e);
						size++;
						return true;
					}
					else{
						return addR(node.right, e);
					}
		
				}
				else if(compare > 0){
					if(node.left == null){
						node.left = new BinaryNode<>(e);
						size++;
						return true;
					}
					else{
						return addR(node.left, e);
					}
				}
				else{
					return false;
				}
			}
    
			
		
	}
    public void addlist(LinkedList<E> list){
        for(E element : list){
            add(element);
        }
    }
    public int height() {
		return height(root);
	}
	public int height(BinaryNode<E> node) {
		if(node == null){
			return 0;
		}
		else{
			return 1 + Math.max(height(node.left) , height(node.right));
		}
		
	}
    public boolean findval(E e){
        if(root == null){
			return false;
		}
        return findval(root, e);
    }
    private boolean findval(BinaryNode<E> node, E e){
        if(comparator != null){
            int compare = comparator.compare(node.element, e);
            if(compare < 0){
                if(node.right == null){
                    return false;
                }
                else{
                    return findval(node.right, e);
                }
    
            }
            else if(compare > 0){
                if(node.left == null){
                    return false;
                }
                else{
                    return findval(node.left, e);
                }
            }
            else{
                return true;
            }}
            else{
                
                    int compare = ((Comparable<E>) node.element).compareTo(e);;
                    if(compare < 0){
                        if(node.right == null){
                            return false;
                        }
                        else{
                            return findval(node.right, e);
                        }
            
                    }
                    else if(compare > 0){
                        if(node.left == null){
                            return false;
                        }
                        else{
                            return findval(node.left, e);
                        }
                    }
                    else{
                        return true;
                    }
                }
        
                
            
        }
    public void findlist(LinkedList<E> list){
        for(E element : list){
            findval(element);
        }
    }
    public void clear() {
		root = null;
		size = 0;
	}
    public void toArray(BinaryNode<E> n, ArrayList<E> sorted) {
		
		if (n != null) {
			toArray(n.left, sorted);
			sorted.add(n.element);
			toArray(n.right, sorted);
			}
		
	}
    @Override 
	public  String toString(){
        ArrayList<E> list = new ArrayList<>();
        toArray(root, list);
        return list.toString();
	}
    }

