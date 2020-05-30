public class KingAmit {
    public static void main(String args[]) {
        /*BTree<Integer> generatedTree = new BTree<Integer>(2);
        generatedTree.insert(91);
        generatedTree.insert(74);
        generatedTree.insert(95);
        generatedTree.insert(20);
        generatedTree.insert(40);
        generatedTree.insert(71);
        generatedTree.insert(18);
        generatedTree.insert(46);
        generatedTree.insert(84);
        generatedTree.insert(15);
        generatedTree.insert(58);
        generatedTree.insert(69);
        generatedTree.insert(36);
        generatedTree.insert(49);
        generatedTree.insert(85);
        generatedTree.insert(44);
        generatedTree.insert(98);
        generatedTree.insert(82);
        System.out.println(generatedTree.toString());


        generatedTree.delete(15);
        System.out.println(generatedTree.toString());
        generatedTree.delete(20);
        System.out.println(generatedTree.toString());

*/

        BTree<Integer> generatedTree = new BTree<Integer>(2);
        generatedTree.insert2pass(73);
        generatedTree.insert2pass(58);
        generatedTree.insert2pass(27);
        generatedTree.insert2pass(95);
        generatedTree.insert2pass(48);
        generatedTree.insert2pass(34);
        generatedTree.insert2pass(31);
        generatedTree.insert2pass(79);
        System.out.println(generatedTree.toString());

        generatedTree.delete(48);
        System.out.println(generatedTree.toString());
        generatedTree.delete(31);
        System.out.println(generatedTree.toString());
        generatedTree.delete(79);
        System.out.println(generatedTree.toString());

    }


}
