package day18;

public class Node {
    private int value;
    private Node leftSon;
    private Node rightSon;
    private Node mysticalFather;

    public Node getMysticalFather() {
        return mysticalFather;
    }

    public void setMysticalFather(Node mysticalFather) {
        this.mysticalFather = mysticalFather;
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public void addNode(Node node) {
        if (getLeftSon() == null && node.getValue() < value) { //проверяем если у корня левый ребенок
            setLeftSon(node); // если нет, узел становится новым ребенком
        } else if (getRightSon() == null && node.getValue() >= value) {
            setRightSon(node);

        } else if (getLeftSon() != null && node.getValue() < value) { // если у корня есть ребенок, мистический отец становится этим ребенком
            mysticalFather = leftSon;
            mysticalFatherСheck(node); // переходим в метод проверки мистического отца с аргументом тогоже узла
        } else if (getRightSon() != null && node.getValue() >= value) {
            mysticalFather = rightSon;
            mysticalFatherСheck(node);
        }
    }

    private void mysticalFatherСheck(Node node) {
        if (mysticalFather.getLeftSon() == null && node.getValue() < mysticalFather.value) { // тоже что и в методе выше, но только теперь работаем не с главным корнем, а с его ребенком
            mysticalFather.leftSon = node;
        } else if (mysticalFather.getRightSon() == null && node.getValue() >= mysticalFather.value) {
            mysticalFather.rightSon = node;
        } else if (mysticalFather.getLeftSon() != null && node.getValue() < mysticalFather.value) {
            mysticalFather = mysticalFather.leftSon; // если ребенок мистического отца не пустой, он превращается в своего ребенка
            mysticalFatherСheck(node); // рекурсия, заходим снова в метод проверки с тем же узлом, но проверяем уже ребенка мистического отца и так далее, пока не обнаружим null
        } else if (mysticalFather.getRightSon() != null && node.getValue() >= mysticalFather.value) {
            mysticalFather = mysticalFather.rightSon;
            mysticalFatherСheck(node);
        }
    }

    @Override
    public String toString() {
        return "Узел{" + value +
                ", ЛевыйРебенок=" + leftSon +
                ", ПравыйРебенок=" + rightSon +
                '}';
    }
}
