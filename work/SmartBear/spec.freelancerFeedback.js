describe('Login Page for Freelancer',()=> {
	it('Protractor Login', () => { 
			browser.get('https://www.freelancer.in/') 
                        .then(() => element(by.xpath('/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[5]/a')).click())
		        		});
});
