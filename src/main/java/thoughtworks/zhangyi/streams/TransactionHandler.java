package thoughtworks.zhangyi.streams;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class TransactionHandler {
    public Map<Currency, List<Transaction>> filterAndGroupByCurrency(List<Transaction> transactions) {
        Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<Currency, List<Transaction>>();

        for (Transaction transaction : transactions) {
            if (transaction.getPrice() > 1000) {
                Currency currency = transaction.getCurrency();
                List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);
                if (transactionsForCurrency == null) {
                    transactionsForCurrency = new ArrayList<Transaction>();
                    transactionsByCurrencies.put(currency, transactionsForCurrency);
                }
                transactionsForCurrency.add(transaction);
            }
        }
        return transactionsByCurrencies;

    }
}
