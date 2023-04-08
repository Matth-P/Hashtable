public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
        int hashNum = chave % 1000;
        if (tabela[hashNum] != null){
            return false;
        }
        else if (tabela[hashNum] == null){
            tabela[hashNum] = chave;
        }
        return true;
    
        
    }

    @Override
    public boolean delete(int chave) {
        int hashNum = chave % 1000;
        if (tabela[hashNum] == null){
            return false;
        }
        else if (tabela[hashNum] != null){
            tabela[hashNum] = null;
        }
        return true;
    
        
    }

    @Override
    public boolean search(int chave) {
        int hashNum = chave % 1000;
        if (tabela[hashNum] != null && tabela[hashNum] == chave){
            return true;
        }
        else {
            return false;
        }
    }
    
}
