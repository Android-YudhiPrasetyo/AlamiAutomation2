Feature: Add to Cart

  Scenario: Verify user can add to cart the item
    Given user open the web page
    When user search "komputer" on search bar
    And user click "Produk terlaris" on search result page
    And user click the first product on search result page
    And user add quantity "3" on item detail page
    And user add item to cart
    And user click add to cart confirmation pop up
    And user click Ubah kurir on cart page
    And user click Batal button on cart page
    And user click Hapus button on cart page
    And user click OK button on delete confirmation pop up
    Then user can see there is no product on cart page

  Scenario: Verify user can search item on category dekorasi rumah
    Given user open the web page
    When user click Home and Food
    And user click Dekorasi rumah
    And user click elevenia recommended
    And user click the first item
    Then user can see the price is "Rp 20.000"
